Feature: GiftVouchers

  Scenario: Proverka
    Given the user is on the admin page
    When the user otiva na GiftVouchers
    And the user proverjava ima li vehce sazdaden takav voucher i ako ima, go iztriva
    And the user sazdava nov voucher
    Then proverjavame dali vouchera e uspeshno sazdaden