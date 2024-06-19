package com.reservation.controller;

import com.reservation.dto.reservation.RestaurantListQuery;
import com.reservation.service.RestaurantService;
import com.reservation.type.RestaurantSortType;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/restaurant")
public class RestaurantController {

    private final RestaurantService restaurantService;

    //매장검색
    @ApiOperation(value = "매장 검색")
    @GetMapping("/list")
    public ResponseEntity<?> storeList(@RequestParam(value = "p", defaultValue = "1") Integer page,
        @RequestBody RestaurantListQuery input) {
        if (input.getSortType().equals(RestaurantSortType.DISTANCE)) {
            return ResponseEntity.ok(restaurantService.findByPost(input.getPost()));
        } else {
            return ResponseEntity.ok(restaurantService.findByPost(input.getPost()));
        }
    }
}