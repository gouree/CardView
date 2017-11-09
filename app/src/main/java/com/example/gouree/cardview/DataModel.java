package com.example.gouree.cardview;

/**
 * Created by omsai on 09/11/2017.
 */


    public class DataModel {

    //fields name,version,id and image
        String name;
        String version;
        int id_;
        int image;

        public DataModel(String name, String version, int id_, int image) {
            this.name = name;
            this.version = version;
            this.id_ = id_;
            this.image=image;
        }

        public String getName() {
            return name;
        }

        public String getVersion() {
            return version;
        }

        public int getImage() {
           return image;
        }

        public int getId() {
            return id_;
        }
    }

