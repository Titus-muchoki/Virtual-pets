import spark.resource.Resource;

public interface before extends Resource {
    void before();

    void after();
}
