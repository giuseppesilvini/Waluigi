package com.fincatto.documentofiscal.cte300;

import com.fincatto.documentofiscal.DFUnidadeFederativa;
import com.fincatto.documentofiscal.cte300.CTeConfig;
import com.fincatto.documentofiscal.cte300.classes.CTTipoEmissao;

import org.junit.Assert;
import org.junit.Test;

import java.security.KeyStore;

public class CTeConfigTest {
    
    @Test
    public void testaParametrosPadrao() {
        final CTeConfigTeste config = new CTeConfigTeste();
        Assert.assertEquals("3.00", CTeConfig.VERSAO);
        Assert.assertEquals("http://www.portalfiscal.inf.br/cte", CTeConfig.NAMESPACE);
        Assert.assertEquals(CTTipoEmissao.EMISSAO_NORMAL, config.getTipoEmissao());
    }
    
    public class CTeConfigTeste extends CTeConfig {
        
        @Override
        public DFUnidadeFederativa getCUF() {
            return null;
        }
        
        @Override
        public KeyStore getCertificadoKeyStore() {
            return null;
        }
        
        @Override
        public String getCertificadoSenha() {
            return null;
        }
        
        @Override
        public KeyStore getCadeiaCertificadosKeyStore() {
            return null;
        }
        
        @Override
        public String getCadeiaCertificadosSenha() {
            return null;
        }
    }
}