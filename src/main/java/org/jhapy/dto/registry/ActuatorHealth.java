/*
 * Copyright 2020-2020 the original author or authors from the JHapy project.
 *
 * This file is part of the JHapy project, see https://www.jhapy.org/ for more information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jhapy.dto.registry;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import org.jhapy.dto.registry.actuate.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jHapy Lead Dev.
 * @version 1.0
 * @since 02/06/2020
 */
@Data
public class ActuatorHealth implements Serializable {

  private String status;
  private Components components;

  public List<AbstractHealthIndicator> getComponentsList() {
    List<AbstractHealthIndicator> result = new ArrayList<>();

    if (components.getConfigServer() != null) {
      components.getConfigServer().setName("ConfigServer");
      result.add(components.getConfigServer());
    }
    if (components.getClientConfigServer() != null) {
      components.getClientConfigServer().setName("ClientConfigServer");
      result.add(components.getClientConfigServer());
    }
    if (components.getDb() != null) {
      components.getDb().setName("Db");
      result.add(components.getDb());
    }
    if (components.getDiscoveryComposite() != null) {
      components.getDiscoveryComposite().setName("DiscoveryComposite");
      result.add(components.getDiscoveryComposite());
    }
    if (components.getDiskSpace() != null) {
      components.getDiskSpace().setName("DiskSpace");
      result.add(components.getDiskSpace());
    }
    if (components.getHazelcast() != null) {
      components.getHazelcast().setName("Hazelcast");
      result.add(components.getHazelcast());
    }
    if (components.getHystrix() != null) {
      components.getHystrix().setName("Hystrix");
      result.add(components.getHystrix());
    }
    if (components.getJms() != null) {
      components.getJms().setName("Jms");
      result.add(components.getJms());
    }
    if (components.getMongo() != null) {
      components.getMongo().setName("Mongo");
      result.add(components.getMongo());
    }
    if (components.getPing() != null) {
      components.getPing().setName("Ping");
      result.add(components.getPing());
    }
    if (components.getRefreshScope() != null) {
      components.getRefreshScope().setName("RefreshScope");
      result.add(components.getRefreshScope());
    }
    if (components.getNeo4j() != null) {
      components.getNeo4j().setName("Neo4j");
      result.add(components.getNeo4j());
    }
    if (components.getLdap() != null) {
      components.getLdap().setName("Ldap");
      result.add(components.getLdap());
    }
    if (components.getRabbit() != null) {
      components.getRabbit().setName("Rabbit");
      result.add(components.getRabbit());
    }
    if (components.getSolr() != null) {
      components.getSolr().setName("Solr");
      result.add(components.getSolr());
    }

    return result;
  }

  @Data
  @SuperBuilder
  public static class Components implements Serializable {

    private ConfigServerHealthIndicator configServer;
    private ClientConfigServerHealthIndicator clientConfigServer;
    private DataSourceHealthIndicator db;
    private DiscoveryServerHealthIndicator discoveryComposite;
    private DiskSpaceHealthIndicator diskSpace;
    private HazelcastHealthIndicator hazelcast;
    private HystrixHealthIndicator hystrix;
    private JmsHealthIndicator jms;
    private MongoHealthIndicator mongo;
    private PingHealthIndicator ping;
    private RefreshScopeHealthIndicator refreshScope;
    private Neo4jHealthIndicator neo4j;
    private LdapHealthIndicator ldap;
    private RabbitHealthIndicator rabbit;
    private SolrHealthIndicator solr;
  }
}