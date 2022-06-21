package kr.co.patternbot.users.settings.controlles;


import kr.co.patternbot.users.settings.services.SettingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/settings")
public class SettingController {
    private final SettingService service;
}
