package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.vault.authentication.ClientAuthentication;
import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.config.AbstractVaultConfiguration;

/**
 * Example class to configure Vault beans using AbstractVaultConfiguration
 *
 */
@Configuration
public class VaultConfig extends AbstractVaultConfiguration {

    @Override
    public ClientAuthentication clientAuthentication() {
        return new TokenAuthentication("hvs.fIWDFRnZs7D8ubEGBFzIxMUV");
    }

    @Override
    public VaultEndpoint vaultEndpoint() {
        return VaultEndpoint.create("127.0.0.1", 8200);
    }

}
