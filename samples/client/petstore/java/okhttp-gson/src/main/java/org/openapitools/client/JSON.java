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


package org.openapitools.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.threeten.bp.format.DateTimeFormatter;

import org.openapitools.client.model.*;
import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

public class JSON {
    private Gson gson;
    private boolean isLenientOnJson = false;
    private DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
                .registerTypeSelector(Animal.class, new TypeSelector<Animal>() {
                    @Override
                    public Class<? extends Animal> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Cat", Cat.class);
                        classByDiscriminatorValue.put("Dog", Dog.class);
                        classByDiscriminatorValue.put("Animal", Animal.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "className"));
                    }
          })
                .registerTypeSelector(Cat.class, new TypeSelector<Cat>() {
                    @Override
                    public Class<? extends Cat> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Cat", Cat.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "className"));
                    }
          })
                .registerTypeSelector(Dog.class, new TypeSelector<Dog>() {
                    @Override
                    public Class<? extends Dog> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Dog", Dog.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "className"));
                    }
          })
                .registerTypeSelector(GrandparentAnimal.class, new TypeSelector<GrandparentAnimal>() {
                    @Override
                    public Class<? extends GrandparentAnimal> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ParentPet", ParentPet.class);
                        classByDiscriminatorValue.put("GrandparentAnimal", GrandparentAnimal.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "pet_type"));
                    }
          })
                .registerTypeSelector(Mammal.class, new TypeSelector<Mammal>() {
                    @Override
                    public Class<? extends Mammal> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Pig", Pig.class);
                        classByDiscriminatorValue.put("whale", Whale.class);
                        classByDiscriminatorValue.put("zebra", Zebra.class);
                        classByDiscriminatorValue.put("mammal", Mammal.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "className"));
                    }
          })
                .registerTypeSelector(NullableShape.class, new TypeSelector<NullableShape>() {
                    @Override
                    public Class<? extends NullableShape> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Quadrilateral", Quadrilateral.class);
                        classByDiscriminatorValue.put("Triangle", Triangle.class);
                        classByDiscriminatorValue.put("NullableShape", NullableShape.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "shapeType"));
                    }
          })
                .registerTypeSelector(ParentPet.class, new TypeSelector<ParentPet>() {
                    @Override
                    public Class<? extends ParentPet> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ParentPet", ParentPet.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "pet_type"));
                    }
          })
                .registerTypeSelector(Pig.class, new TypeSelector<Pig>() {
                    @Override
                    public Class<? extends Pig> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("BasquePig", BasquePig.class);
                        classByDiscriminatorValue.put("DanishPig", DanishPig.class);
                        classByDiscriminatorValue.put("Pig", Pig.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "className"));
                    }
          })
                .registerTypeSelector(Quadrilateral.class, new TypeSelector<Quadrilateral>() {
                    @Override
                    public Class<? extends Quadrilateral> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("ComplexQuadrilateral", ComplexQuadrilateral.class);
                        classByDiscriminatorValue.put("SimpleQuadrilateral", SimpleQuadrilateral.class);
                        classByDiscriminatorValue.put("Quadrilateral", Quadrilateral.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "quadrilateralType"));
                    }
          })
                .registerTypeSelector(Shape.class, new TypeSelector<Shape>() {
                    @Override
                    public Class<? extends Shape> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Quadrilateral", Quadrilateral.class);
                        classByDiscriminatorValue.put("Triangle", Triangle.class);
                        classByDiscriminatorValue.put("Shape", Shape.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "shapeType"));
                    }
          })
                .registerTypeSelector(ShapeOrNull.class, new TypeSelector<ShapeOrNull>() {
                    @Override
                    public Class<? extends ShapeOrNull> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("Quadrilateral", Quadrilateral.class);
                        classByDiscriminatorValue.put("Triangle", Triangle.class);
                        classByDiscriminatorValue.put("ShapeOrNull", ShapeOrNull.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "shapeType"));
                    }
          })
                .registerTypeSelector(Triangle.class, new TypeSelector<Triangle>() {
                    @Override
                    public Class<? extends Triangle> getClassForElement(JsonElement readElement) {
                        Map<String, Class> classByDiscriminatorValue = new HashMap<String, Class>();
                        classByDiscriminatorValue.put("EquilateralTriangle", EquilateralTriangle.class);
                        classByDiscriminatorValue.put("IsoscelesTriangle", IsoscelesTriangle.class);
                        classByDiscriminatorValue.put("ScaleneTriangle", ScaleneTriangle.class);
                        classByDiscriminatorValue.put("Triangle", Triangle.class);
                        return getClassByDiscriminator(classByDiscriminatorValue,
                                getDiscriminatorValue(readElement, "triangleType"));
                    }
          })
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    public JSON() {
        gson = createGson()
            .registerTypeAdapter(Date.class, dateTypeAdapter)
            .registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter)
            .registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter)
            .registerTypeAdapter(LocalDate.class, localDateTypeAdapter)
            .registerTypeAdapter(byte[].class, byteArrayAdapter)
            .registerTypeAdapterFactory(new AdditionalPropertiesClass.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Animal.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Apple.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new AppleReq.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new ArrayOfArrayOfNumberOnly.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new ArrayOfNumberOnly.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new ArrayTest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Banana.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new BananaReq.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new BasquePig.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Capitalization.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Cat.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new CatAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Category.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new ClassModel.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Client.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new ComplexQuadrilateral.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new DanishPig.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new DeprecatedObject.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Dog.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new DogAllOf.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Drawing.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new EnumArrays.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new EnumTest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new EquilateralTriangle.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new FileSchemaTestClass.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Foo.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new FormatTest.CustomTypeAdapterFactory())
            .registerTypeAdapter(Fruit.class, new Fruit.CustomSerializer())
            .registerTypeAdapter(Fruit.class, new Fruit.CustomDeserializer())
            .registerTypeAdapter(FruitReq.class, new FruitReq.CustomSerializer())
            .registerTypeAdapter(FruitReq.class, new FruitReq.CustomDeserializer())
            // TODO anyof model
            .registerTypeAdapterFactory(new GrandparentAnimal.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new HasOnlyReadOnly.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new HealthCheckResult.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new InlineResponseDefault.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new IsoscelesTriangle.CustomTypeAdapterFactory())
            .registerTypeAdapter(Mammal.class, new Mammal.CustomSerializer())
            .registerTypeAdapter(Mammal.class, new Mammal.CustomDeserializer())
            .registerTypeAdapterFactory(new MapTest.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new MixedPropertiesAndAdditionalPropertiesClass.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Model200Response.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new ModelApiResponse.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new ModelReturn.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Name.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new NullableClass.CustomTypeAdapterFactory())
            .registerTypeAdapter(NullableShape.class, new NullableShape.CustomSerializer())
            .registerTypeAdapter(NullableShape.class, new NullableShape.CustomDeserializer())
            .registerTypeAdapterFactory(new NumberOnly.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new ObjectWithDeprecatedFields.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Order.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new OuterComposite.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new ParentPet.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Pet.CustomTypeAdapterFactory())
            .registerTypeAdapter(Pig.class, new Pig.CustomSerializer())
            .registerTypeAdapter(Pig.class, new Pig.CustomDeserializer())
            .registerTypeAdapter(Quadrilateral.class, new Quadrilateral.CustomSerializer())
            .registerTypeAdapter(Quadrilateral.class, new Quadrilateral.CustomDeserializer())
            .registerTypeAdapterFactory(new QuadrilateralInterface.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new ReadOnlyFirst.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new ScaleneTriangle.CustomTypeAdapterFactory())
            .registerTypeAdapter(Shape.class, new Shape.CustomSerializer())
            .registerTypeAdapter(Shape.class, new Shape.CustomDeserializer())
            .registerTypeAdapterFactory(new ShapeInterface.CustomTypeAdapterFactory())
            .registerTypeAdapter(ShapeOrNull.class, new ShapeOrNull.CustomSerializer())
            .registerTypeAdapter(ShapeOrNull.class, new ShapeOrNull.CustomDeserializer())
            .registerTypeAdapterFactory(new SimpleQuadrilateral.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new SpecialModelName.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Tag.CustomTypeAdapterFactory())
            .registerTypeAdapter(Triangle.class, new Triangle.CustomSerializer())
            .registerTypeAdapter(Triangle.class, new Triangle.CustomDeserializer())
            .registerTypeAdapterFactory(new TriangleInterface.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new User.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Whale.CustomTypeAdapterFactory())
            .registerTypeAdapterFactory(new Zebra.CustomTypeAdapterFactory())
            .create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     * @return JSON
     */
    public JSON setGson(Gson gson) {
        this.gson = gson;
        return this;
    }

    public JSON setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
        return this;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public JSON setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public JSON setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
        return this;
    }

    public JSON setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
        return this;
    }
}