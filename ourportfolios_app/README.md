# Docker コマンドまとめ

## 1. コンテナの起動・停止・削除

### コンテナを起動（バックグラウンドで実行）
```sh
docker-compose up -d
```

### コンテナをビルドして起動
```sh
docker-compose up --build -d
```

### 特定のサービスのみ起動
```sh
docker-compose up -d サービス名
```

### コンテナを停止
```sh
docker-compose down
```

### コンテナを停止せずに削除
```sh
docker-compose rm -f
```

### 再起動（変更を反映する場合）
```sh
docker-compose down && docker-compose up --build -d
```

### コンテナのステータスを確認
```sh
docker-compose ps
```

### コンテナのログを確認
```sh
docker-compose logs -f
```

---

## 2. コンテナの状態確認

### 実行中のコンテナを確認
```sh
docker ps
```

### すべてのコンテナ（停止中も含む）を確認
```sh
docker ps -a
```

### コンテナのログを確認
```sh
docker logs -f コンテナ名
```

### コンテナの詳細情報を確認
```sh
docker inspect コンテナ名
```

---

## 3. コンテナに入る

### コンテナのシェルを開く
```sh
docker exec -it コンテナ名 bash
```

bash が入っていない場合は sh を試す：
```sh
docker exec -it コンテナ名 sh
```

---

## 4. イメージ関連の操作

### すべてのイメージを表示
```sh
docker images
```

### イメージを削除
```sh
docker rmi イメージID
```

### すべての未使用イメージを削除
```sh
docker image prune -a
```

---

## 5. ビルド関連

### Docker イメージを手動でビルド
```sh
docker build -t イメージ名 .
```

### キャッシュを使わずにビルド
```sh
docker build --no-cache -t イメージ名 .
```

---

## 6. ボリューム関連

### すべてのボリュームを確認
```sh
docker volume ls
```

### ボリュームを削除
```sh
docker volume rm ボリューム名
```

### すべての未使用ボリュームを削除
```sh
docker volume prune
```

---

## 7. ネットワーク関連

### すべてのネットワークを表示
```sh
docker network ls
```

### ネットワークの詳細を確認
```sh
docker network inspect ネットワーク名
```

### 未使用のネットワークを削除
```sh
docker network prune
```

---

## 8. キャッシュのクリア

### すべての不要なデータを削除
```sh
docker system prune -a
```

---

## 9. よくあるトラブルシューティング

### コンテナが立ち上がらない / `apt-get update` が失敗する場合
```sh
docker run --rm -it ubuntu:latest bash
apt-get update
```

### ポートが競合してコンテナが起動しない場合
```sh
sudo lsof -i :ポート番号
sudo kill -9 プロセスID
```

### コンテナが固まった場合
```sh
docker restart コンテナ名
```

