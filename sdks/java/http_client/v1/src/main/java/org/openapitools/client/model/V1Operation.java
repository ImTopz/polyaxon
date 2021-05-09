// Copyright 2018-2021 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/*
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * The version of the OpenAPI document: 1.9.0
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.V1Cache;
import org.openapitools.client.model.V1Component;
import org.openapitools.client.model.V1EventTrigger;
import org.openapitools.client.model.V1Hook;
import org.openapitools.client.model.V1Join;
import org.openapitools.client.model.V1Param;
import org.openapitools.client.model.V1PatchStrategy;
import org.openapitools.client.model.V1Plugins;
import org.openapitools.client.model.V1Template;
import org.openapitools.client.model.V1Termination;
import org.openapitools.client.model.V1TriggerPolicy;

/**
 * V1Operation
 */

public class V1Operation {
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Float version;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_PRESETS = "presets";
  @SerializedName(SERIALIZED_NAME_PRESETS)
  private List<String> presets = null;

  public static final String SERIALIZED_NAME_QUEUE = "queue";
  @SerializedName(SERIALIZED_NAME_QUEUE)
  private String queue;

  public static final String SERIALIZED_NAME_CACHE = "cache";
  @SerializedName(SERIALIZED_NAME_CACHE)
  private V1Cache cache;

  public static final String SERIALIZED_NAME_TERMINATION = "termination";
  @SerializedName(SERIALIZED_NAME_TERMINATION)
  private V1Termination termination;

  public static final String SERIALIZED_NAME_PLUGINS = "plugins";
  @SerializedName(SERIALIZED_NAME_PLUGINS)
  private V1Plugins plugins;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private Object schedule;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<V1EventTrigger> events = null;

  public static final String SERIALIZED_NAME_HOOKS = "hooks";
  @SerializedName(SERIALIZED_NAME_HOOKS)
  private List<V1Hook> hooks = null;

  public static final String SERIALIZED_NAME_DEPENDENCIES = "dependencies";
  @SerializedName(SERIALIZED_NAME_DEPENDENCIES)
  private List<String> dependencies = null;

  public static final String SERIALIZED_NAME_TRIGGER = "trigger";
  @SerializedName(SERIALIZED_NAME_TRIGGER)
  private V1TriggerPolicy trigger = V1TriggerPolicy.ALL_SUCCEEDED;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private String conditions;

  public static final String SERIALIZED_NAME_SKIP_ON_UPSTREAM_SKIP = "skipOnUpstreamSkip";
  @SerializedName(SERIALIZED_NAME_SKIP_ON_UPSTREAM_SKIP)
  private Boolean skipOnUpstreamSkip;

  public static final String SERIALIZED_NAME_MATRIX = "matrix";
  @SerializedName(SERIALIZED_NAME_MATRIX)
  private Object matrix;

  public static final String SERIALIZED_NAME_JOINS = "joins";
  @SerializedName(SERIALIZED_NAME_JOINS)
  private Map<String, V1Join> joins = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private Map<String, V1Param> params = null;

  public static final String SERIALIZED_NAME_RUN_PATCH = "runPatch";
  @SerializedName(SERIALIZED_NAME_RUN_PATCH)
  private Object runPatch;

  public static final String SERIALIZED_NAME_PATCH_STRATEGY = "patchStrategy";
  @SerializedName(SERIALIZED_NAME_PATCH_STRATEGY)
  private V1PatchStrategy patchStrategy = V1PatchStrategy.REPLACE;

  public static final String SERIALIZED_NAME_IS_PRESET = "isPreset";
  @SerializedName(SERIALIZED_NAME_IS_PRESET)
  private Boolean isPreset;

  public static final String SERIALIZED_NAME_IS_APPROVED = "isApproved";
  @SerializedName(SERIALIZED_NAME_IS_APPROVED)
  private Boolean isApproved;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private V1Template template;

  public static final String SERIALIZED_NAME_URL_REF = "urlRef";
  @SerializedName(SERIALIZED_NAME_URL_REF)
  private String urlRef;

  public static final String SERIALIZED_NAME_PATH_REF = "pathRef";
  @SerializedName(SERIALIZED_NAME_PATH_REF)
  private String pathRef;

  public static final String SERIALIZED_NAME_HUB_REF = "hubRef";
  @SerializedName(SERIALIZED_NAME_HUB_REF)
  private String hubRef;

  public static final String SERIALIZED_NAME_DAG_REF = "dagRef";
  @SerializedName(SERIALIZED_NAME_DAG_REF)
  private String dagRef;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private V1Component component;


  public V1Operation version(Float version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Float getVersion() {
    return version;
  }


  public void setVersion(Float version) {
    this.version = version;
  }


  public V1Operation kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1Operation name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1Operation description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public V1Operation tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public V1Operation addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<String>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public V1Operation presets(List<String> presets) {
    
    this.presets = presets;
    return this;
  }

  public V1Operation addPresetsItem(String presetsItem) {
    if (this.presets == null) {
      this.presets = new ArrayList<String>();
    }
    this.presets.add(presetsItem);
    return this;
  }

   /**
   * Get presets
   * @return presets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPresets() {
    return presets;
  }


  public void setPresets(List<String> presets) {
    this.presets = presets;
  }


  public V1Operation queue(String queue) {
    
    this.queue = queue;
    return this;
  }

   /**
   * Get queue
   * @return queue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueue() {
    return queue;
  }


  public void setQueue(String queue) {
    this.queue = queue;
  }


  public V1Operation cache(V1Cache cache) {
    
    this.cache = cache;
    return this;
  }

   /**
   * Get cache
   * @return cache
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Cache getCache() {
    return cache;
  }


  public void setCache(V1Cache cache) {
    this.cache = cache;
  }


  public V1Operation termination(V1Termination termination) {
    
    this.termination = termination;
    return this;
  }

   /**
   * Get termination
   * @return termination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Termination getTermination() {
    return termination;
  }


  public void setTermination(V1Termination termination) {
    this.termination = termination;
  }


  public V1Operation plugins(V1Plugins plugins) {
    
    this.plugins = plugins;
    return this;
  }

   /**
   * Get plugins
   * @return plugins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Plugins getPlugins() {
    return plugins;
  }


  public void setPlugins(V1Plugins plugins) {
    this.plugins = plugins;
  }


  public V1Operation schedule(Object schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getSchedule() {
    return schedule;
  }


  public void setSchedule(Object schedule) {
    this.schedule = schedule;
  }


  public V1Operation events(List<V1EventTrigger> events) {
    
    this.events = events;
    return this;
  }

  public V1Operation addEventsItem(V1EventTrigger eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<V1EventTrigger>();
    }
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1EventTrigger> getEvents() {
    return events;
  }


  public void setEvents(List<V1EventTrigger> events) {
    this.events = events;
  }


  public V1Operation hooks(List<V1Hook> hooks) {
    
    this.hooks = hooks;
    return this;
  }

  public V1Operation addHooksItem(V1Hook hooksItem) {
    if (this.hooks == null) {
      this.hooks = new ArrayList<V1Hook>();
    }
    this.hooks.add(hooksItem);
    return this;
  }

   /**
   * Get hooks
   * @return hooks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<V1Hook> getHooks() {
    return hooks;
  }


  public void setHooks(List<V1Hook> hooks) {
    this.hooks = hooks;
  }


  public V1Operation dependencies(List<String> dependencies) {
    
    this.dependencies = dependencies;
    return this;
  }

  public V1Operation addDependenciesItem(String dependenciesItem) {
    if (this.dependencies == null) {
      this.dependencies = new ArrayList<String>();
    }
    this.dependencies.add(dependenciesItem);
    return this;
  }

   /**
   * Get dependencies
   * @return dependencies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDependencies() {
    return dependencies;
  }


  public void setDependencies(List<String> dependencies) {
    this.dependencies = dependencies;
  }


  public V1Operation trigger(V1TriggerPolicy trigger) {
    
    this.trigger = trigger;
    return this;
  }

   /**
   * Get trigger
   * @return trigger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1TriggerPolicy getTrigger() {
    return trigger;
  }


  public void setTrigger(V1TriggerPolicy trigger) {
    this.trigger = trigger;
  }


  public V1Operation conditions(String conditions) {
    
    this.conditions = conditions;
    return this;
  }

   /**
   * Get conditions
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConditions() {
    return conditions;
  }


  public void setConditions(String conditions) {
    this.conditions = conditions;
  }


  public V1Operation skipOnUpstreamSkip(Boolean skipOnUpstreamSkip) {
    
    this.skipOnUpstreamSkip = skipOnUpstreamSkip;
    return this;
  }

   /**
   * Get skipOnUpstreamSkip
   * @return skipOnUpstreamSkip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSkipOnUpstreamSkip() {
    return skipOnUpstreamSkip;
  }


  public void setSkipOnUpstreamSkip(Boolean skipOnUpstreamSkip) {
    this.skipOnUpstreamSkip = skipOnUpstreamSkip;
  }


  public V1Operation matrix(Object matrix) {
    
    this.matrix = matrix;
    return this;
  }

   /**
   * Get matrix
   * @return matrix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMatrix() {
    return matrix;
  }


  public void setMatrix(Object matrix) {
    this.matrix = matrix;
  }


  public V1Operation joins(Map<String, V1Join> joins) {
    
    this.joins = joins;
    return this;
  }

  public V1Operation putJoinsItem(String key, V1Join joinsItem) {
    if (this.joins == null) {
      this.joins = new HashMap<String, V1Join>();
    }
    this.joins.put(key, joinsItem);
    return this;
  }

   /**
   * Get joins
   * @return joins
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, V1Join> getJoins() {
    return joins;
  }


  public void setJoins(Map<String, V1Join> joins) {
    this.joins = joins;
  }


  public V1Operation params(Map<String, V1Param> params) {
    
    this.params = params;
    return this;
  }

  public V1Operation putParamsItem(String key, V1Param paramsItem) {
    if (this.params == null) {
      this.params = new HashMap<String, V1Param>();
    }
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, V1Param> getParams() {
    return params;
  }


  public void setParams(Map<String, V1Param> params) {
    this.params = params;
  }


  public V1Operation runPatch(Object runPatch) {
    
    this.runPatch = runPatch;
    return this;
  }

   /**
   * Get runPatch
   * @return runPatch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRunPatch() {
    return runPatch;
  }


  public void setRunPatch(Object runPatch) {
    this.runPatch = runPatch;
  }


  public V1Operation patchStrategy(V1PatchStrategy patchStrategy) {
    
    this.patchStrategy = patchStrategy;
    return this;
  }

   /**
   * Get patchStrategy
   * @return patchStrategy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1PatchStrategy getPatchStrategy() {
    return patchStrategy;
  }


  public void setPatchStrategy(V1PatchStrategy patchStrategy) {
    this.patchStrategy = patchStrategy;
  }


  public V1Operation isPreset(Boolean isPreset) {
    
    this.isPreset = isPreset;
    return this;
  }

   /**
   * Get isPreset
   * @return isPreset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPreset() {
    return isPreset;
  }


  public void setIsPreset(Boolean isPreset) {
    this.isPreset = isPreset;
  }


  public V1Operation isApproved(Boolean isApproved) {
    
    this.isApproved = isApproved;
    return this;
  }

   /**
   * Get isApproved
   * @return isApproved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsApproved() {
    return isApproved;
  }


  public void setIsApproved(Boolean isApproved) {
    this.isApproved = isApproved;
  }


  public V1Operation template(V1Template template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Template getTemplate() {
    return template;
  }


  public void setTemplate(V1Template template) {
    this.template = template;
  }


  public V1Operation urlRef(String urlRef) {
    
    this.urlRef = urlRef;
    return this;
  }

   /**
   * Get urlRef
   * @return urlRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrlRef() {
    return urlRef;
  }


  public void setUrlRef(String urlRef) {
    this.urlRef = urlRef;
  }


  public V1Operation pathRef(String pathRef) {
    
    this.pathRef = pathRef;
    return this;
  }

   /**
   * Get pathRef
   * @return pathRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPathRef() {
    return pathRef;
  }


  public void setPathRef(String pathRef) {
    this.pathRef = pathRef;
  }


  public V1Operation hubRef(String hubRef) {
    
    this.hubRef = hubRef;
    return this;
  }

   /**
   * Get hubRef
   * @return hubRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHubRef() {
    return hubRef;
  }


  public void setHubRef(String hubRef) {
    this.hubRef = hubRef;
  }


  public V1Operation dagRef(String dagRef) {
    
    this.dagRef = dagRef;
    return this;
  }

   /**
   * Get dagRef
   * @return dagRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDagRef() {
    return dagRef;
  }


  public void setDagRef(String dagRef) {
    this.dagRef = dagRef;
  }


  public V1Operation component(V1Component component) {
    
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1Component getComponent() {
    return component;
  }


  public void setComponent(V1Component component) {
    this.component = component;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Operation v1Operation = (V1Operation) o;
    return Objects.equals(this.version, v1Operation.version) &&
        Objects.equals(this.kind, v1Operation.kind) &&
        Objects.equals(this.name, v1Operation.name) &&
        Objects.equals(this.description, v1Operation.description) &&
        Objects.equals(this.tags, v1Operation.tags) &&
        Objects.equals(this.presets, v1Operation.presets) &&
        Objects.equals(this.queue, v1Operation.queue) &&
        Objects.equals(this.cache, v1Operation.cache) &&
        Objects.equals(this.termination, v1Operation.termination) &&
        Objects.equals(this.plugins, v1Operation.plugins) &&
        Objects.equals(this.schedule, v1Operation.schedule) &&
        Objects.equals(this.events, v1Operation.events) &&
        Objects.equals(this.hooks, v1Operation.hooks) &&
        Objects.equals(this.dependencies, v1Operation.dependencies) &&
        Objects.equals(this.trigger, v1Operation.trigger) &&
        Objects.equals(this.conditions, v1Operation.conditions) &&
        Objects.equals(this.skipOnUpstreamSkip, v1Operation.skipOnUpstreamSkip) &&
        Objects.equals(this.matrix, v1Operation.matrix) &&
        Objects.equals(this.joins, v1Operation.joins) &&
        Objects.equals(this.params, v1Operation.params) &&
        Objects.equals(this.runPatch, v1Operation.runPatch) &&
        Objects.equals(this.patchStrategy, v1Operation.patchStrategy) &&
        Objects.equals(this.isPreset, v1Operation.isPreset) &&
        Objects.equals(this.isApproved, v1Operation.isApproved) &&
        Objects.equals(this.template, v1Operation.template) &&
        Objects.equals(this.urlRef, v1Operation.urlRef) &&
        Objects.equals(this.pathRef, v1Operation.pathRef) &&
        Objects.equals(this.hubRef, v1Operation.hubRef) &&
        Objects.equals(this.dagRef, v1Operation.dagRef) &&
        Objects.equals(this.component, v1Operation.component);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, kind, name, description, tags, presets, queue, cache, termination, plugins, schedule, events, hooks, dependencies, trigger, conditions, skipOnUpstreamSkip, matrix, joins, params, runPatch, patchStrategy, isPreset, isApproved, template, urlRef, pathRef, hubRef, dagRef, component);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Operation {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    presets: ").append(toIndentedString(presets)).append("\n");
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    cache: ").append(toIndentedString(cache)).append("\n");
    sb.append("    termination: ").append(toIndentedString(termination)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    hooks: ").append(toIndentedString(hooks)).append("\n");
    sb.append("    dependencies: ").append(toIndentedString(dependencies)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    skipOnUpstreamSkip: ").append(toIndentedString(skipOnUpstreamSkip)).append("\n");
    sb.append("    matrix: ").append(toIndentedString(matrix)).append("\n");
    sb.append("    joins: ").append(toIndentedString(joins)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    runPatch: ").append(toIndentedString(runPatch)).append("\n");
    sb.append("    patchStrategy: ").append(toIndentedString(patchStrategy)).append("\n");
    sb.append("    isPreset: ").append(toIndentedString(isPreset)).append("\n");
    sb.append("    isApproved: ").append(toIndentedString(isApproved)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    urlRef: ").append(toIndentedString(urlRef)).append("\n");
    sb.append("    pathRef: ").append(toIndentedString(pathRef)).append("\n");
    sb.append("    hubRef: ").append(toIndentedString(hubRef)).append("\n");
    sb.append("    dagRef: ").append(toIndentedString(dagRef)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

