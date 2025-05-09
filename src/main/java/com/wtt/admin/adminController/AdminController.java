package com.wtt.admin.adminController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend
public class AdminController {

    private final String ADMIN_USER_ID = "admin";
    private final String ADMIN_PASSWORD = "Gayatri@1234";
    private boolean isLoggedIn = false;

    @PostMapping("/login")
    public ResponseEntity<Map<String, Object>> login(@RequestBody Map<String, String> payload) {
        String userId = payload.get("userId");
        String password = payload.get("password");

        Map<String, Object> response = new HashMap<>();

        if (ADMIN_USER_ID.equals(userId) && ADMIN_PASSWORD.equals(password)) {
            isLoggedIn = true;
            response.put("success", true);
            response.put("message", "Login successful");
            return ResponseEntity.ok(response);
        } else {
            response.put("success", false);
            response.put("message", "Invalid User ID or Password");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
        }
    }

    @GetMapping("/dashboard-data")
    public ResponseEntity<?> getDashboardData() {
        if (!isLoggedIn) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Not logged in");
        }

        // Dummy dashboard data
        Map<String, Object> data = new HashMap<>();
        data.put("totalVisitors", 42);
        data.put("activeUsers", 7);
        return ResponseEntity.ok(data);
    }
}
