package com.app.onthisday.callbacks;

import com.app.onthisday.models.Images;
import com.app.onthisday.models.Post;

import java.util.ArrayList;
import java.util.List;

public class CallbackPostDetail {

    public String status = "";
    public Post post = null;
    public List<Images> images = new ArrayList<>();
    public List<Post> related = new ArrayList<>();

}
