import React, { useState } from 'react';

function TextDownloader() {
  const [text, setText] = useState('Texto de ejemplo');
  let namePassenger = "KenyiHancco"

  const handleDownload = () => {
    const element = document.createElement('a');
    const file = new Blob([text], { type: 'text/plain' });
    element.href = URL.createObjectURL(file);
    element.download = `${namePassenger}.txt`;
    document.body.appendChild(element);
    element.click();
    document.body.removeChild(element);
  };

  return (
    <div>
      <textarea value={text} onChange={e => setText(e.target.value)} />
      <br />
      <button onClick={handleDownload}>Descargar como TXT</button>
    </div>
  );
}

export default TextDownloader;
