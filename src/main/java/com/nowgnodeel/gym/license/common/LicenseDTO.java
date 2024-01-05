package com.nowgnodeel.gym.license.common;

import com.nowgnodeel.gym.license.domain.License;

public record LicenseDTO(
    String licenseName,
    String licenseGrade,
    String licenseCreateAt,
    String licenseExpireAt,
    String licenseEvent
) {
  public License toEntity() {
    return License.builder()
        .licenseName(licenseName)
        .licenseGrade(licenseGrade)
        .licenseEvent(licenseEvent)
        .licenseCreateAt(licenseCreateAt)
        .licenseExpireAt(licenseExpireAt)
        .build();
  }
}
