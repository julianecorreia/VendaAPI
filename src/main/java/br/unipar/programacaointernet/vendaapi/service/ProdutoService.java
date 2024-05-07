package br.unipar.programacaointernet.vendaapi.service;

import br.unipar.programacaointernet.vendaapi.dto.ProdutoDescricaoValorDTO;
import br.unipar.programacaointernet.vendaapi.mapper.ProdutoMapper;
import br.unipar.programacaointernet.vendaapi.model.Produto;
import br.unipar.programacaointernet.vendaapi.repository.ProdutoRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class ProdutoService {

    @Inject
    private ProdutoRepository produtoRepository;

    public List<Produto> listar() {
        return produtoRepository.listar();
    }
    
    public Produto buscarPorID(Integer id) {
        return produtoRepository.buscarPorID(id);
    }
    
    public void cadastrar(Produto produto) throws Exception {
        produtoRepository.cadastrar(produto);
    }

    public void editar(Produto produto) throws Exception {
        produtoRepository.editar(produto);
    }

    public void excluir(Produto produto) throws Exception {
        produtoRepository.excluir(produto);
    }

    public List<ProdutoDescricaoValorDTO> listarProdutoDescricao() {
        List<Produto> listProduto = produtoRepository.listar();
        return ProdutoMapper.toDTO(listProduto);
    }
}
