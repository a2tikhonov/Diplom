package ru.skypro.homework.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.NewPassword;
import ru.skypro.homework.dto.User;

@RestController
@RequestMapping("/users")
@CrossOrigin(value = "http://localhost:3000")
public class UserController {

    @GetMapping("/me")
    public ResponseEntity<User> getUser() {
        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/set_password")
    public ResponseEntity<NewPassword> setPassword(@RequestBody NewPassword newPassword) {
        return new ResponseEntity<NewPassword>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PatchMapping("/me")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PatchMapping(value = "/me/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Void> updateUserImage(@RequestParam MultipartFile image) {
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }
}
