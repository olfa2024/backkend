package com.example.backend.prayertime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/prayer-times")
public class PrayerTimeController {


    @Autowired
    private PrayerTimeService prayerTimeService;

    @GetMapping
    public List<PrayerTime> getAllPrayerTimes() {
        return prayerTimeService.getAllPrayerTimes();
    }

    @PostMapping
    public PrayerTime addPrayerTime(@RequestBody PrayerTime prayerTime) {
        return prayerTimeService.savePrayerTime(prayerTime);
    }


}