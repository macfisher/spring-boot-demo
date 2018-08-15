package com.sorclab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class DisplayEnvironmentService
{
    @Autowired
    private Environment env;

    public String[] getActiveProfiles() { return env.getActiveProfiles(); }
    public String[] getDefaultProfiles() { return env.getDefaultProfiles(); }
}
