package com.qrent.authorizationserver.repository.redis;

import com.qrent.authorizationserver.model.redis.TokensEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokensRedisRepository extends CrudRepository<TokensEntity, String> {
}