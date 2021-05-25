package com.myexample.spring5jokesapp.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class JokeServiceImpl implements JokeService {
    @Override
    public String getJokes() {
        return Integer.toString(new Random().nextInt());
    }
}
