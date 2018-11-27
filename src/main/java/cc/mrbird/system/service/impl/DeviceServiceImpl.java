package cc.mrbird.system.service.impl;

import cc.mrbird.common.service.impl.BaseService;
import cc.mrbird.system.service.DeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import cc.mrbird.system.domain.Device;

@Service("deviceService")
public class DeviceServiceImpl extends BaseService<Device>  implements DeviceService {
    private Logger log = LoggerFactory.getLogger(this.getClass());


    @Override
    public Device findByName(String deptName) {
        return new Device();
    }
}

