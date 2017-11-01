package com.oluwadara.ojoodide.youtrackmobile.data.models.repository;


import com.oluwadara.ojoodide.youtrackmobile.data.models.Location;
import com.oluwadara.ojoodide.youtrackmobile.data.models.User;

import io.reactivex.Observable;

public interface UserRepository {

    Observable<String> signUp(User user);
    Observable<String> signIn(User user);
    Observable<User> getUser(String id);
    Observable<String> saveUser(String id);
    Observable<Boolean> saveUserLocation(String id, Location userLocation);
}
