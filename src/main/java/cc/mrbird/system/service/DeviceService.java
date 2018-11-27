package cc.mrbird.system.service;

import cc.mrbird.common.service.IService;
import  cc.mrbird.system.domain.Device;

public interface DeviceService extends IService<Device> {
    Device findByName(String deptName);
}
