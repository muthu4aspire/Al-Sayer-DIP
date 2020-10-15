package com.alsayer.core.roadsideassistance.services;

import com.alsayer.core.model.DriverDetailsModel;
import com.alsayer.core.model.ServiceRequestModel;
import com.alsayer.core.model.VehicleModel;

import java.util.List;

public interface RoadSideAssistanceService {
    public void saveServiceRequest(ServiceRequestModel serviceRequestModel);
    public DriverDetailsModel getDriverDetails();
}

