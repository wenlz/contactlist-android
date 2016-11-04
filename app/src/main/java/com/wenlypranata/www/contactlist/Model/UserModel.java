package com.wenlypranata.www.contactlist.Model;

import org.json.JSONException;
import org.json.JSONObject;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by wenlz on 11/4/2016.
 */

public class UserModel extends RealmObject{
    @PrimaryKey
    private String id;
    private String email;
    private String fullname;

    public UserModel() {

    }

    public UserModel(JSONObject object) {
        try {
            if (object.has("_id")) {
                setId(object.getString("_id"));
            }
            if (object.has("email")) {
                setEmail(object.getString("email"));
            }
            if (object.has("fullname")) {
                setFullname(object.getString("fullname"));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}
