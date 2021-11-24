package com.ghada.parfum.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nom_parfum", types = { Parfum.class })
public interface ParfumProjection {
public String getNomParfum();
}