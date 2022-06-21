package kr.co.patternbot.users.settings.services;

import kr.co.patternbot.users.settings.repositories.SettingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SettingServiceImpl implements SettingService {
    private final SettingRepository repository;
}
