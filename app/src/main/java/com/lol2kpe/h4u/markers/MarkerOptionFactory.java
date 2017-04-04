package com.lol2kpe.h4u.markers;

import android.location.Location;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.lol2kpe.h4u.Hospital;
import com.lol2kpe.h4u.R;
import com.lol2kpe.h4u.userlocation.UserLocation;

/**
 * Created by sam on 2017-04-04.
 */

public class MarkerOptionFactory{
    public static MarkerOptions getMarkerOptions(Hospital hospital){
        return new MarkerOptions()
                .title(hospital.getName())
                .position(
                        new LatLng(
                            Double.parseDouble(hospital.getLatitude()),
                            Double.parseDouble(hospital.getLongitude())
                        )
                )
                .icon(provideHospitalIcon());
    }
    public static MarkerOptions getMarkerOptions(UserLocation userLocation){
        return new MarkerOptions()
                .position(
                        new LatLng(
                                userLocation.getLatitude(),
                                userLocation.getLongitude()
                        )
                )
                .title(userLocation.getName());
    }
    private static BitmapDescriptor provideHospitalIcon(){
        return BitmapDescriptorFactory.fromResource(R.drawable.ic_local_hospital);
    }
}
