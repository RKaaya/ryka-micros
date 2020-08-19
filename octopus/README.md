# ryka-micros-octopus

Config server:

Searching for configuration: /applications/{application}-{profile}.yaml

Server can be queried with: http://{host}:{port}/{application}/{profile}

Properties:
* application: spring.application.name
* profile: spring.cloud.config.profile
* label: spring.cloud.config.label