package ru.skypro.homework.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.Ads;
import ru.skypro.homework.dto.CreateAds;
import ru.skypro.homework.dto.ResponseWrapperAds;

@RestController
@RequestMapping("/ads/")
public class AdsController {

    @GetMapping
    public ResponseEntity<ResponseWrapperAds> getAllAds() {
        return new ResponseEntity<ResponseWrapperAds>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping
    ResponseEntity<Ads> addAds(@RequestBody CreateAds createAds) {
        return new ResponseEntity<Ads>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/me/")
    ResponseEntity<ResponseWrapperAds> getAdsMe(@RequestParam(value = "authenticated") Boolean authenticated,
                                                @RequestParam(value = "authorities[0].authority") String authorities0Authority,
                                                @RequestParam(value = "credentials") Object credentials,
                                                @RequestParam(value = "details") Object details,
                                                @RequestParam(value = "principal") Object principal) {
        return new ResponseEntity<ResponseWrapperAds>(HttpStatus.NOT_IMPLEMENTED);
    }


}
