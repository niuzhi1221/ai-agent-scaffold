package cn.bugstack.ai.domain.agent.service.armory.factory;

import com.google.adk.agents.BaseAgent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.openai.api.OpenAiApi;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class DefaultArmoryFactory {

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class DynamicContext{
        /**
         * LLM API
         */
        private OpenAiApi openAiApi;

        /**
         * LLM ChatModel
         */
        private ChatModel chatModel;

        /**
         * 智能体配置组
         */
        private Map<String, BaseAgent>  agentGroup = new HashMap<>();

        private Map<String, Object> dataObjects = new HashMap<>();

        public <T> void setValue(String key, T value){
            dataObjects.put(key, value);
        }

        public <T> T getValue(String key){
            return (T) dataObjects.get(key);
        }

    }
}
