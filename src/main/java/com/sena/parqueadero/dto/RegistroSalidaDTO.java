package com.sena.parqueadero.dto;

import lombok.Data;

@Data
public class RegistroSalidaDTO {

	private Long idRgegistro;
	private String placa;
	private Double ValorCobrado;
	private long horasEstadia;
	
}
