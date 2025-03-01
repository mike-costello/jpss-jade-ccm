ConfigMap object: ccm-configs

| Key | Description | Type | 
| - | - | - |
| dems-case-auto-creation | DEMS case auto creation flag | true / false |
| dems-case-template-id | DEMS case template id | numeric |
| dems-host-url | DEMS URI | Host URI (without HTTP prefix) |
| dems-org-unit-id | DEMS case organization unit id | numeric |
| justin-host-url | JUSTIN URI | Host URI (without HTTP prefix) |
| splunk-host-url | Splunk URI | Host URI (without HTTP prefix) |
| pidp-kafka-topic-usercreation-name | PIDP Kafka User Creation Topic Name | string |
| pidp-oauth-token-endpoint-url | PIDP OAuth Token Endpoint URI | Host URI (with HTTP prefix) |
| pidp-kafka-bootstrapservers-url | PIDP Kafka Boostrap Servers URI | Host URI (without HTTP prefix) |
| pidp-kafka-apicurioregistry-url | PIDP Kafka Apicurio Registry URI | Host URI (with HTTP prefix) |
| pidp-oauth-client-id | PIDP Oauth Client Id | string |

Secret object: ccm-secrets

| Key | Description | Type | 
| - | - | - |
| dems-adapter-secret-token | DEMS Adapter security token (deprecated) | masked string |
| dems-security-token | DEMS API security token | masked string |
| justin-security-token | JUSTIN API security token | masked string |
| splunk-security-token | Splunk API security token | masked string |
| pidp-oauth-client-secret | PIDP Oauth client secret | masked string |
| pidp-kafka-client.p12-password | PIDP Kafka client PKCS (Java keystore) file password | masked string |
| pidp-kafka-server.p12-password | PIDP Kafka server PKCS (Java truststore) file password | masked string |
| pidp-kafka-client.p12 | PIDP Kafka client PKCS (Java keystore) file | masked string |
| pidp-kafka-server.p12 | PIDP Kafka server PKCS (Java truststore) file | masked string |