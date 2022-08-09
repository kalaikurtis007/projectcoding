package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.vault.annotation.VaultPropertySource;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;
import org.springframework.vault.config.EnvironmentVaultConfiguration;

/**
 * Example class to configure Vault beans using EnvironmentVaultConfiguration
 *
 */
@Configuration
@VaultPropertySource(value = { "secrets/secret/DEV/application.properties" })
//@Import(value = EnvironmentVaultConfiguration.class)
public class VaultEnvironmentConfig {

}
