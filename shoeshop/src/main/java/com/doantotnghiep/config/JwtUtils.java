package com.doantotnghiep.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class JwtUtils {

    private static final String SECRET_KEY = "trandai"; // Đây là khóa bí mật

    private static final long EXPIRATION_TIME = 3600000; // Thời gian hết hạn của access token (1 giờ)

    
    //tạo token
    public static String generateAccessToken(String subject) {
        Date now = new Date();
        Date expirationTime = new Date(now.getTime() + EXPIRATION_TIME);

        String accessToken = Jwts.builder()
                .setSubject(subject)
                .setIssuedAt(now)
                .setExpiration(expirationTime)
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();

        return accessToken;
    }
    
    // validate token
    public static Claims validateAccessToken(String accessToken) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(SECRET_KEY)
                    .parseClaimsJws(accessToken)
                    .getBody();
            return claims;
        } catch (Exception e) {
            // Xử lý lỗi nếu access token không hợp lệ
            throw new RuntimeException("Access token is invalid");
        }
    }
    
    //lay thong tin khi co accesstoken
    public static String extractUserName(String token) {
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(SECRET_KEY)
                    .parseClaimsJws(token)
                    .getBody();
            return claims.getSubject(); // Trả về thông tin tên người dùng từ subject của token
        } catch (Exception e) {
            // Xử lý lỗi nếu có
            return null;
        }
    }
    
    //kiem tra tinh hop le
    public static boolean validateRefreshToken(String refreshToken) {
        try {
            // Kiểm tra tính hợp lệ của refreshToken bằng cách giải mã và kiểm tra chữ ký
            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(refreshToken);
            return true; // Nếu không có exception, refreshToken hợp lệ
        } catch (Exception e) {
            // Xử lý lỗi nếu có
            return false;
        }
    }
    
    //refreshToken
    public static String generateRefreshToken(String userName) {
        // Tạo chuỗi token với nội dung là userName
        String refreshToken = Jwts.builder()
                .setSubject(userName)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
        return refreshToken;
    }
    

}

