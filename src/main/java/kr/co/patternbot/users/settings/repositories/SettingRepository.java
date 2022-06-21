package kr.co.patternbot.users.settings.repositories;

import kr.co.patternbot.users.settings.domains.Setting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettingRepository extends JpaRepository<Setting, Long> {
}
