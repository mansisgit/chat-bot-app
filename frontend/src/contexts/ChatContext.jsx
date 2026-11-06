import { createContext } from 'react';

export const ChatContext = createContext(null);

export default function ChatProvider({ children }) {
  return <ChatContext.Provider value={{}}>{children}</ChatContext.Provider>;
}
