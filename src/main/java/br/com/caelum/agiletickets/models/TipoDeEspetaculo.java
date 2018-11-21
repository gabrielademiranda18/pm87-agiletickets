package br.com.caelum.agiletickets.models;

import br.com.caelum.agiletickets.domain.precos.CalculaPreco;
import br.com.caelum.agiletickets.domain.precos.CalculaPrecoBallet;
import br.com.caelum.agiletickets.domain.precos.CalculaPrecoCinema;
import br.com.caelum.agiletickets.domain.precos.CalculaPrecoOrquestra;
import br.com.caelum.agiletickets.domain.precos.CalculaPrecoShow;
import br.com.caelum.agiletickets.domain.precos.CalculaPrecoTeatro;

public enum TipoDeEspetaculo {
	
	CINEMA {
		@Override
		public CalculaPreco calculador() {
			return new CalculaPrecoCinema();
		}
	}, 
	SHOW {
		@Override
		public CalculaPreco calculador() {
			return new CalculaPrecoShow();
		}
	}, 
	TEATRO {
		@Override
		public CalculaPreco calculador() {
			return new CalculaPrecoTeatro();
		}
	}, 
	BALLET {
		@Override
		public CalculaPreco calculador() {
			return new CalculaPrecoBallet();
		}
	},
	ORQUESTRA {
		@Override
		public CalculaPreco calculador() {
			return new CalculaPrecoOrquestra();
		}
	};	
	
	public abstract CalculaPreco calculador();
}
