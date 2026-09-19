# Modern Spring Cloud Guidance

Some older Spring Boot microservices tutorials use Netflix OSS components such as Ribbon, Hystrix, and Zuul. They are still useful historically, but a new service should generally use the current Spring ecosystem choices below.

| Earlier component | Prefer for new Spring applications | Why |
| --- | --- | --- |
| Ribbon | Spring Cloud LoadBalancer | Client-side load balancing supported by Spring Cloud. |
| Hystrix | Resilience4j | Circuit breakers, time limiters, retries, bulkheads, and rate limiters with Spring Boot integration. |
| Zuul | Spring Cloud Gateway | A modern API gateway designed for routing, filtering, and cross-cutting API concerns. |
| Sleuth + Zipkin | Micrometer Tracing with a compatible tracing backend | Standardized application observations, metrics, logs, and traces. |

## Practical service baseline

For a production-ready service, start with:

- Spring Boot Actuator health and readiness endpoints;
- structured logs and trace/correlation IDs;
- timeouts for every network call;
- Resilience4j only around known remote dependencies;
- idempotent request or event handling where retries are possible; and
- contract and integration tests around service boundaries.

## Migration mindset

Do not replace a component only because it is old. First document the current behaviour, add monitoring and tests, then migrate one cross-cutting concern at a time. This reduces production risk and gives teams an observable rollback path.
