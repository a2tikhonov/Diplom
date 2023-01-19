package ru.skypro.homework.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.dto.*;

@RestController
@RequestMapping("/ads")
@CrossOrigin(value = "http://localhost:3000")
public class AdsController {

    @GetMapping
    public ResponseEntity<ResponseWrapperAds> getAllAds() {
        return new ResponseEntity<ResponseWrapperAds>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping
    ResponseEntity<Ads> addAds(@RequestBody CreateAds createAds) {
        return new ResponseEntity<Ads>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/me")
    ResponseEntity<ResponseWrapperAds> getAdsMe(@RequestParam(value = "authenticated") Boolean authenticated,
                                                @RequestParam(value = "authorities[0].authority") String authorities0Authority,
                                                @RequestParam(value = "credentials") Object credentials,
                                                @RequestParam(value = "details") Object details,
                                                @RequestParam(value = "principal") Object principal) {
        return new ResponseEntity<ResponseWrapperAds>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/{ad_pk}/comments")
    ResponseEntity<ResponseWrapperAdsComment> getAdsComments(@PathVariable String ad_pk) {
        /* Не уловил тут смысл, почему ad_pk String, если в dto он Integer */
        return new ResponseEntity<ResponseWrapperAdsComment>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PostMapping("/{ad_pk}/comments")
    ResponseEntity<AdsComment> addComments(@PathVariable String ad_pk, @RequestBody AdsComment adsComment) {
        return new ResponseEntity<AdsComment>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/{id}")
    ResponseEntity<FullAds> getFullAd(@PathVariable Integer id) {
        return new ResponseEntity<FullAds>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> removeAds(@PathVariable Integer id) {
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PatchMapping("/{id}")
    ResponseEntity<Ads> updateAds(@PathVariable Integer id, @RequestBody CreateAds adsBody) {
        return new ResponseEntity<Ads>(HttpStatus.NOT_IMPLEMENTED);
    }

    @GetMapping("/{ad_pk}/comments/{id}")
    ResponseEntity<AdsComment> getComments(@PathVariable("ad_pk") String ad_pk, @PathVariable("id") Integer id) {
        return new ResponseEntity<AdsComment>(HttpStatus.NOT_IMPLEMENTED);
    }

    @DeleteMapping("/{ad_pk}/comments/{id}")
    ResponseEntity<Void> deleteComments(@PathVariable("ad_pk") String ad_pk, @PathVariable("id") Integer id) {
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    @PatchMapping("/{ad_pk}/comments/{id}")
    ResponseEntity<AdsComment> updateComments(@PathVariable("ad_pk") String ad_pk, @PathVariable("id") Integer id, @RequestBody AdsComment adsCommentBody) {
        return new ResponseEntity<AdsComment>(HttpStatus.NOT_IMPLEMENTED);
    }
}
