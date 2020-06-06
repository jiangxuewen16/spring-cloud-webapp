package com.huiquyun.webapp.console.service;

import com.huiquyun.integral.api.IntegralService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;


@FeignClient("saas-inergra")
public interface RemoteIntegralService extends IntegralService {
}
