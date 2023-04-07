package com.ems.services;

import com.ems.payloads.BonusDto;

public interface BonusService {

    BonusDto createBonus(Long eid, BonusDto bonusDto);
}
