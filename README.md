# 🏭 Projet Usine Logicielle – DevOps & DevSecOps

## 🎯 Objectif du projet

Ce projet a pour objectif de concevoir, déployer et superviser une **usine logicielle moderne complète** basée sur les principes DevOps et DevSecOps.

L'objectif est de démontrer un cycle de vie entièrement automatisé :

```bash
Git → CI/CD → Docker → Kubernetes → GitOps → Monitoring → Alerting

```

tout en intégrant :

- ✅ automatisation (CI/CD)
- ✅ qualité logicielle (tests)
- ✅ sécurité (DevSecOps)
- ✅ supervision (monitoring)

---

## 🧾 Contexte

Une entreprise spécialisée dans le développement d’applications web souhaite industrialiser ses pratiques DevOps.

### 🔴 Situation actuelle

- Builds et déploiements manuels ❌
- Tests non systématiques ❌
- Environnements hétérogènes ❌
- Sécurité insuffisante ❌
- Supervision limitée ❌

### 🟢 Objectif

Mettre en place une **chaîne DevOps complète automatisée** :

```bash
Développement → Intégration → Build → Sécurité → Déploiement → Supervision → Alerting
```

---

## 🧭 Vue globale de l’architecture

![Architecture Diagram](./img/architecture.png)

---

## 🧩 Stack technique

| Domaine | Outil | Rôle | Justification |
|----------|-------|------|---------------|
| Planification | Trello | Gestion des tâches | Visualisation Kanban, collaboration, suivi de projet |
| Développement | Vscode, GitHub | IDE et gestion de version | Développement, versioning, collaboration |
| Build | npm | Gestion des dépendances | Automatisation du build, gestion des packages |
| Tests | Cucumber | Tests fonctionnels | Automatisation des tests, BDD |
| Conteneurisation | Docker | Conteneurisation des applications | Isolation, portabilité, déploiement |
| Orchestration | Kubernetes | Déploiement et gestion des conteneurs | Scalabilité, haute disponibilité, gestion des ressources |
| Déploiement (phase 1) | GitHub Actions, Ansible | Automatisation du déploiement | CI/CD, automatisation des tâches |
| GitOps (phase 2) | ArgoCD | Déploiement GitOps | Automatisation du déploiement, synchronisation avec le dépôt Git |
| Monitoring | Prometheus | Collecte de métriques | Surveillance des performances, alerting |
| Visualisation | Grafana | Visualisation des métriques | Tableaux de bord, alerting |
| Alerting | Alertmanager + Slack | Notifications d’alerte | Alertes en temps réel, communication d’incidents |

---

## 🔄 Fonctionnement de l’usine logicielle

### 📌 Pipeline CI/CD

```bash
Push Git → CI déclenchée :
   → Tests Cucumber
   → Scan Gitleaks
   → Scan Hadolint
   → OWASP Dependency Check
   → Build Maven
   → Docker build & push
   → Scan Trivy
   → Update manifest Kubernetes
```

---

## ⚙️ Déploiement GitOps

- ArgoCD surveille le repository Git
- Détection automatique des changements
- Déploiement Kubernetes automatisé

```bash
git push → ArgoCD détecte → déploie → cluster mis à jour
```

---

## 🚀 Kubernetes

Cluster :

- K3s multi-node
- NodePort / LoadBalancer (MetalLB)
- Déploiement via manifest YAML

---

## 📊 Monitoring & Observability

### ✅ Prometheus

- Collecte métriques cluster
- Collecte métriques applications

### ✅ Grafana

- Dashboards :
  - CPU / RAM
  - Pods
  - Nodes
  - Applications

---

## 🚨 Alerting

### Alertmanager

- Détection événements critiques :
- CPU élevé
- Crash de pods
- erreurs applicatives

### Slack

Exemple d’alerte :

```bash
🚨 ALERT: High CPU Usage
Pod: app-java
Namespace: default
```

---

## 🧪 Qualité logicielle

- Tests automatisés avec Cucumber
- Validation à chaque pipeline CI
- Feedback rapide
- Amélioration continue de la qualité du code

---

## 🔐 Sécurité (DevSecOps)

- Isolation des applications via Docker
- Centralisation des logs pour audit et traçabilité
- Pipeline CI/CD contrôlé et sécurisé
- Réduction des risques liés aux erreurs humaines

---

## 🔐 DevSecOps

### ✅ Sécurité pipeline

- Gitleaks → secrets
- Trivy → vulnérabilités Docker
  - Dependency Check → dépendances

### ✅ Sécurité infra

- Isolation Docker
- Contrôle accès Kubernetes

---

## 📦 Livrables

Les éléments suivants sont fournis dans le cadre du projet :

- [x] Code source GitHub
- [x] Pipeline CI/CD complet
- [x] Image Docker publiée
- [x] Déploiement Kubernetes automatisé
- [x] GitOps avec ArgoCD
- [x] Monitoring (Prometheus + Grafana)
- [x] Alerting (Slack)
- [x] Documentation complète

---

## 🚀 Perspectives d’évolution

- 🔹 **Ingress + HTTPS (cert-manager)**

  Permet d’exposer l’application via un nom de domaine propre (ex : app.local) au lieu d’un port, tout en ajoutant le HTTPS automatiquement grâce à cert-manager. Cela améliore la sécurité (TLS) et l’expérience utilisateur.

- 🔹 **Horizontal Pod Autoscaler (HPA)**

  Permet d’adapter automatiquement le nombre de pods en fonction de la charge (CPU, mémoire). L’application devient capable de scaler dynamiquement, ce qui améliore la performance et la disponibilité.

- 🔹 **Logs centralisés (ELK / Loki)**

  Centralise tous les logs des pods dans une plateforme unique. Cela permet de faciliter le debug, analyser les erreurs et tracer les incidents sans dépendre de kubectl logs.

- 🔹 **Tracing distribué (Jaeger)**

  Permet de suivre une requête de bout en bout dans l’application (ex : API → service → base de données). Utile pour comprendre les performances et identifier les lenteurs dans un système distribué.

- 🔹 **Multi-environnements (dev / staging / prod)**

  Sépare les environnements pour tester avant mise en production. Avec GitOps (ArgoCD), chaque environnement peut être lié à une branche Git différente, ce qui sécurise les déploiements.

---

## 🧑‍💻 Auteurs

- **Joseph DELNORD** – *Ingénieur Infra & DevSecOps* – [GitHub](https://github.com/josephDelnordd)
- **Guillaume PATTI** – *Ingénieur Infra & DevSecOps* – [GitHub](https://github.com/Arkeinm)
