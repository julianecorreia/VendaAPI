package br.unipar.programacaointernet.vendaapi.mapper;

import br.unipar.programacaointernet.vendaapi.dto.ProdutoDescricaoValorDTO;
import br.unipar.programacaointernet.vendaapi.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoMapper {

    public static List<ProdutoDescricaoValorDTO> toDTO(List<Produto> produtoList) {

        List<ProdutoDescricaoValorDTO> dtoList = new ArrayList<>();

        for (Produto produto : produtoList) {
            ProdutoDescricaoValorDTO dto =
                new ProdutoDescricaoValorDTO();
            dto.setDescricao(produto.getDescricao());
            dto.setValor_unitario(produto.getValor_unitario());

            dtoList.add(dto);
        }
        return dtoList;
    }

}


