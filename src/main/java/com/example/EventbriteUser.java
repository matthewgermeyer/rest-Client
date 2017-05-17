package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EventbriteUser {

    private String id;
    private String name;
    private String first_name;
    private String last_name;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }


    @Override
    public String toString() {
        return "EventbriteUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                '}';
    }

    private static class Email {
        private String email;
        private boolean verified;
        private boolean primary;

        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public boolean isVerified() {
            return verified;
        }
        public void setVerified(boolean verified) {
            this.verified = verified;
        }
        public boolean isPrimary() {
            return primary;
        }
        public void setPrimary(boolean primary) {
            this.primary = primary;
        }
        @Override
        public String toString() {
            return "[ verified=" + verified + ", primary=" + primary + "]";
        }

    }
}
