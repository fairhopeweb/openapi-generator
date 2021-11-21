/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
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
import org.openapitools.client.model.ParentPet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * GrandparentAnimal
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GrandparentAnimal {
  public static final String SERIALIZED_NAME_PET_TYPE = "pet_type";
  @SerializedName(SERIALIZED_NAME_PET_TYPE)
  protected String petType;

  public GrandparentAnimal() { 
    this.petType = this.getClass().getSimpleName();
  }

  public GrandparentAnimal petType(String petType) {
    
    this.petType = petType;
    return this;
  }

   /**
   * Get petType
   * @return petType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getPetType() {
    return petType;
  }


  public void setPetType(String petType) {
    this.petType = petType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GrandparentAnimal grandparentAnimal = (GrandparentAnimal) o;
    return Objects.equals(this.petType, grandparentAnimal.petType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(petType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrandparentAnimal {\n");
    sb.append("    petType: ").append(toIndentedString(petType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("pet_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pet_type");
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GrandparentAnimal.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GrandparentAnimal' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GrandparentAnimal> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GrandparentAnimal.class));

       return (TypeAdapter<T>) new TypeAdapter<GrandparentAnimal>() {
           @Override
           public void write(JsonWriter out, GrandparentAnimal value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GrandparentAnimal read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!GrandparentAnimal.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `GrandparentAnimal` properties");
               }
             }

             // check to make sure all required properties/fields are present in the JSON string
             for (String requiredField : GrandparentAnimal.openapiRequiredFields) {
               if (obj.get(requiredField) == null) {
                 throw new IllegalArgumentException("The required field `" + requiredField + "` is not found in the JSON string");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
/*
  public static class CustomDeserializer implements JsonDeserializer<GrandparentAnimal> {
    @Override
    public GrandparentAnimal deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
      JsonObject obj = json.getAsJsonObject(); //since you know it's a JsonObject
      Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry: entries) {
        if (!GrandparentAnimal.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `GrandparentAnimal` properties");
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : GrandparentAnimal.openapiRequiredFields) {
        if (obj.get(requiredField) == null) {
          throw new IllegalArgumentException("The required field `" + requiredField + "` is not found in the JSON string");
        }
      }

      // all checks passed, return using the original implementation of deserialize
      return new Gson().fromJson(json, GrandparentAnimal.class);
    }
  }*/
}
