package com.inancial.transaction.business.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;

import com.inancial.transaction.business.dto.ClientDTO;
import com.inancial.transaction.business.model.Client;

public class MapperUtils {

	public static List<ClientDTO> convertToDto(List<Client> listClient) {

		List<ClientDTO> listClientResult = new ArrayList<ClientDTO>();

		if (listClient != null && !listClient.isEmpty()) {

			for (Client c : listClient) {
				ClientDTO clientDTO = convertToDto(c);
				listClientResult.add(clientDTO);
			}

		}

		return listClientResult;

	}

	public static ClientDTO convertToDto(Client client) {
		ModelMapper modelMapper = new ModelMapper();

		ClientDTO clientDTO = null;

		if (client != null) {
			clientDTO = modelMapper.map(client, ClientDTO.class);
			clientDTO.setBalance(applyRounding(client.getBalance()));

		}
		return clientDTO;
	}

	private static BigDecimal applyRounding(BigDecimal bd) {
		for (RoundingMode roundingMode : RoundingMode.values()) {
			if (roundingMode == RoundingMode.UNNECESSARY) {
				continue;
			}
			BigDecimal result = bd.setScale(2, roundingMode);
			return result;
		}
		return bd;
	}
}
