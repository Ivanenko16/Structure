package com.company.infrastructure.utils;

public class Url {
    private Boolean isSecure = false;
    private String domain = "";
    private String port = "";
    private String path = "";
    private String parameters = "?";

    public Url() {
    }

    public Url(Boolean isSecure, String domain, String port, String path, String parameters) {
        this.isSecure = isSecure;
        this.domain = domain;
        this.port = port;
        this.path = path;
        this.parameters = parameters;
    }

    public Boolean getSecure() {
        return isSecure;
    }

    public String getDomain() {
        return domain;
    }

    public String getPort() {
        return port;
    }

    public String getPath() {
        return path;
    }

    public String getParameters() {
        return parameters;
    }

    public static class Builder {
        private Url url;

        public Builder() {
            this.url = new Url();
        }

        public Builder withSecure() {
            this.url.isSecure = true;
            return this;
        }

        public Builder withDomain(String domain) {
            this.url.domain = domain;
            return this;
        }

        public Builder withPort(String port) {
            this.url.port = ":" + port;
            return this;
        }

        public Builder withPath(String path) {
            if (!path.startsWith("/")) ;
            this.url.path = path;
            return this;
        }

        public Builder withParam(String param) {
            this.url.parameters += param + "&";
            return this;
        }

        public Builder withParam(String key, String value) {
            this.url.parameters += key + "=" + value + "&";
            return this;
        }

        public String build() {
            String url = "htpp";
            if (this.url.isSecure)
                url += "s";
            url += "://" + this.url.getDomain()
                    + this.url.getPort()
                    + this.url.getPath()
                    + this.url.getParameters();
            return url;
        }
    }
}
