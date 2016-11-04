package com.wenlypranata.www.contactlist.Event;

import com.wenlypranata.www.contactlist.Model.UserModel;

/**
 * Created by wenlz on 11/4/2016.
 */

public class LoginSuccessEvent {
    public UserModel user;
    public String response;

    public LoginSuccessEvent(UserModel user, String response)
    {
        this.user = user;
        this.response = response;
    }
}
