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
import java.util.ArrayList;
import java.util.List;

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
 * EnumArrays
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnumArrays {
  /**
   * Gets or Sets justSymbol
   */
  @JsonAdapter(JustSymbolEnum.Adapter.class)
  public enum JustSymbolEnum {
    GREATER_THAN_OR_EQUAL_TO(">="),
    
    DOLLAR("$");

    private String value;

    JustSymbolEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static JustSymbolEnum fromValue(String value) {
      for (JustSymbolEnum b : JustSymbolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<JustSymbolEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final JustSymbolEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public JustSymbolEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return JustSymbolEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_JUST_SYMBOL = "just_symbol";
  @SerializedName(SERIALIZED_NAME_JUST_SYMBOL)
  private JustSymbolEnum justSymbol;

  /**
   * Gets or Sets arrayEnum
   */
  @JsonAdapter(ArrayEnumEnum.Adapter.class)
  public enum ArrayEnumEnum {
    FISH("fish"),
    
    CRAB("crab");

    private String value;

    ArrayEnumEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ArrayEnumEnum fromValue(String value) {
      for (ArrayEnumEnum b : ArrayEnumEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ArrayEnumEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ArrayEnumEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ArrayEnumEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ArrayEnumEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ARRAY_ENUM = "array_enum";
  @SerializedName(SERIALIZED_NAME_ARRAY_ENUM)
  private List<ArrayEnumEnum> arrayEnum = null;

  public EnumArrays() { 
  }

  public EnumArrays justSymbol(JustSymbolEnum justSymbol) {
    
    this.justSymbol = justSymbol;
    return this;
  }

   /**
   * Get justSymbol
   * @return justSymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public JustSymbolEnum getJustSymbol() {
    return justSymbol;
  }


  public void setJustSymbol(JustSymbolEnum justSymbol) {
    this.justSymbol = justSymbol;
  }


  public EnumArrays arrayEnum(List<ArrayEnumEnum> arrayEnum) {
    
    this.arrayEnum = arrayEnum;
    return this;
  }

  public EnumArrays addArrayEnumItem(ArrayEnumEnum arrayEnumItem) {
    if (this.arrayEnum == null) {
      this.arrayEnum = new ArrayList<ArrayEnumEnum>();
    }
    this.arrayEnum.add(arrayEnumItem);
    return this;
  }

   /**
   * Get arrayEnum
   * @return arrayEnum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ArrayEnumEnum> getArrayEnum() {
    return arrayEnum;
  }


  public void setArrayEnum(List<ArrayEnumEnum> arrayEnum) {
    this.arrayEnum = arrayEnum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnumArrays enumArrays = (EnumArrays) o;
    return Objects.equals(this.justSymbol, enumArrays.justSymbol) &&
        Objects.equals(this.arrayEnum, enumArrays.arrayEnum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(justSymbol, arrayEnum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnumArrays {\n");
    sb.append("    justSymbol: ").append(toIndentedString(justSymbol)).append("\n");
    sb.append("    arrayEnum: ").append(toIndentedString(arrayEnum)).append("\n");
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
    openapiFields.add("just_symbol");
    openapiFields.add("array_enum");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnumArrays.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnumArrays' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnumArrays> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnumArrays.class));

       return (TypeAdapter<T>) new TypeAdapter<EnumArrays>() {
           @Override
           public void write(JsonWriter out, EnumArrays value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnumArrays read(JsonReader in) throws IOException {
             JsonObject obj = elementAdapter.read(in).getAsJsonObject();
             Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
             // check to see if the JSON string contains additional fields
             for (Entry<String, JsonElement> entry: entries) {
               if (!EnumArrays.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `EnumArrays` properties");
               }
             }

             return thisAdapter.fromJsonTree(obj);
           }

       }.nullSafe();
    }
  }
/*
  public static class CustomDeserializer implements JsonDeserializer<EnumArrays> {
    @Override
    public EnumArrays deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
      JsonObject obj = json.getAsJsonObject(); //since you know it's a JsonObject
      Set<Entry<String, JsonElement>> entries = obj.entrySet();//will return members of your object
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry: entries) {
        if (!EnumArrays.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException("The field `" + entry.getKey() + "` in the JSON string is not defined in the `EnumArrays` properties");
        }
      }

      // all checks passed, return using the original implementation of deserialize
      return new Gson().fromJson(json, EnumArrays.class);
    }
  }*/
}
