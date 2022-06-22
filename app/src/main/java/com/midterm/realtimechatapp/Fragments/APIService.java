package com.midterm.realtimechatapp.Fragments;

import com.midterm.realtimechatapp.Notifications.MyResponse;
import com.midterm.realtimechatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=\tAAAAuRimyJY:APA91bEiKAC7dbL0qBNx91mqMKSatOmUE8X5NLQZXaWYGSPGN734ZZc2Ms5H8VV0-ncPWR0eYEtJDfvh_1CJ7Mh9fjHXSmD9H8AJtC34p8fDPXhVmTM0bBcsIE6UkVSAjXjOjxfdtF6T"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
