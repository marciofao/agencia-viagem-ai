package dev.ia;

import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService
public interface TravelAgentAssitant {

    /**
     * @param userMessage A mensagem do usuário
     * @return A resposta gerada pelo LLM
     */

    String chat(String userMessage);

}
