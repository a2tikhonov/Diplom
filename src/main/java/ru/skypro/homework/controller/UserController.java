package ru.skypro.homework.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.homework.dto.NewPassword;
import ru.skypro.homework.dto.User;

@RestController
@Tag(name = "Пользователь", description = "Управление данными пользователя")
@RequestMapping("/users")
@CrossOrigin(value = "http://localhost:3000")
public class UserController {

    @Operation(
            summary = "Получить данные",
            description = "Выводит данные о пользователе"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = User.class))),

            @ApiResponse(responseCode = "401", description = "Unauthorized"),

            @ApiResponse(responseCode = "403", description = "Forbidden"),

            @ApiResponse(responseCode = "404", description = "Not Found") })
    @GetMapping("/me")
    public ResponseEntity<User> getUser() {
        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }
    @Operation(
            summary = "Установить пароль",
            description = "Позволяет обновить пароль пользователя"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = NewPassword.class))),

            @ApiResponse(responseCode = "401", description = "Unauthorized"),

            @ApiResponse(responseCode = "403", description = "Forbidden"),

            @ApiResponse(responseCode = "404", description = "Not Found") })
    @PostMapping("/set_password")
    public ResponseEntity<NewPassword> setPassword(@RequestBody NewPassword newPassword) {
        return new ResponseEntity<NewPassword>(HttpStatus.NOT_IMPLEMENTED);
    }
    @Operation(
            summary = "Обновить данные",
            description = "Позволяет обновить информацию о пользователе"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "*/*", schema = @Schema(implementation = User.class))),

            @ApiResponse(responseCode = "204", description = "No Content"),

            @ApiResponse(responseCode = "401", description = "Unauthorized"),

            @ApiResponse(responseCode = "403", description = "Forbidden"),

            @ApiResponse(responseCode = "404", description = "Not Found") })
    @PatchMapping("/me")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }
    @Operation(
            summary = "Показать аватарку",
            description = "Получить изображение пользователя"
    )
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),

            @ApiResponse(responseCode = "404", description = "Not Found") })
    @PatchMapping(value = "/me/image", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<Void> updateUserImage(@RequestParam MultipartFile image) {
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }
}
