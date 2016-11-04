package com.wenlypranata.www.contactlist.Model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by wenlz on 11/4/2016.
 */

public class FriendModel extends RealmObject{
    @PrimaryKey
    private String id;
    private String fullname;
}
